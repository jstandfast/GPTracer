# Place to test various modules without running the whole system

import os
import java

# test
path = os.getcwd()
print(path)
# end of test

os.chdir(path + '\\source')

# test
path = os.getcwd()
print(path)
# end of test

os.chdir('..\\output')

# test
path = os.getcwd()
print(path)
# end of test

os.chdir('..')

# test
path = os.getcwd()
print(path)
# end of test

#java.execute_java('Test3')
