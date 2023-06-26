import constants
import prompts
import java
import os
import sys
import openai
import json
import requests
import os.path

# Obtain main file path
PATH = os.getcwd()

# ChatGPT API Key Setup
key = constants.API_KEY_CHATGPT
openai.api_key = key

# Testing if user input argument to represent source file
# Production of source file name, basename, and extension
# Else exit the program
if len(sys.argv) > 1:
  file_name = sys.argv[1]
  file_basename, file_extension = os.path.splitext(file_name)
else:
  print('No file provided. Run again with file name as argument.')
  exit()

# Checking if there is already an output file that matches source file
# If so, using subsequent prompt design vs. intiial prompt design.
# Also reads the output file in full to send to GPT.
if os.path.isfile(PATH + '\\output\\{file_name}'):
  request = prompts.sub_prompt(file_extension, file_name)
  os.chdir(PATH + '\\output')
  with open(file_name, 'r') as file:
    lines = file.readlines()
else:
  request = prompts.initial_prompt(file_extension, file_name)

# Read the source file to send to GPT. This could be in tandem with
# output file in order to use same format as last execution.
os.chdir(PATH + '\\source')
with open(file_name, 'r') as file:
  lines = file.readlines()

inputfile="\n".join(lines)

# Submission of message to GPT model
response=openai.ChatCompletion.create(
  model="gpt-3.5-turbo",
  messages=[
        {"role": "system", "content": request},
        {"role": "user", "content": inputfile}
    ]
)

# Receipt and formatting of return response
filecontents=response['choices'][0]["message"]["content"]
filecontents=filecontents.replace('\n\n', '\n')

# Writing the new output file based on GPT's modified source code
os.chdir(PATH + '\\output')
output_path = os.getcwd()
f = open(file_name, 'w+')
f.write(filecontents)
f.close()

# Compile and run edited output file
java.compile_java(output_path, file_name)
java.execute_java(output_path, file_basename)