import constants
import prompts
import java
import os
import sys
import openai
import json
import requests
import os.path

PATH = os.getcwd()

print(os.getcwd())

if len(sys.argv) > 1:
  file_name = sys.argv[1]
  file_basename, file_extension = os.path.splitext(file_name)
else:
  print('No file provided. Run again with file name as argument.')
  exit()

if os.path.isfile(PATH + '\\output\\{file_name}'):
  request = prompts.sub_prompt(file_extension, file_name)
  os.chdir(PATH + '\\output')
  with open(file_name, 'r') as file:
    lines = file.readlines()
  print(os.getcwd())
else:
  request = prompts.initial_prompt(file_extension, file_name)

os.chdir(PATH + '\\source')
print(os.getcwd())

with open(file_name, 'r') as file:
  lines = file.readlines()

inputfile="\n".join(lines)

os.chdir(PATH + '\\output')

f = open(file_name, 'w+')
f.write(inputfile)
f.close()

os.chdir(PATH)
output_path = os.getcwd() + '\\output'
print(output_path)

java.compile_java(output_path, file_name)
java.execute_java(output_path, file_basename)