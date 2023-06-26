Simple README for GPTracer

To run:
-May need to install openai (pip install openai)
-Include source file(s) in 'source' folder.
-Include ChatGPT API key in a file called constants.py
--Label API key API_KEY_CHATGPT
-From GPTracer directory, run python codetracer.py file_name.
--Replace file_name with your entire file name (ex: Test.java).

GPTracer will prompt GPT-3.5-Turbo to add print statements to output
program information following intricate schema detailed in files. It
will then produce a copy of the original source file in the output
folder, compile, and then execute the copy. The output will then display
in the console.

Subsequent runs will utilize a different prompt. The prompt recognizes
that the system has been run at least once already by the presence of
a file in output with the given file name. It then prompts GPT to edit
the source file identically to the output file except with updates for
any changes made. The message sent to GPT will include both the new
source file and the latest modified file.



