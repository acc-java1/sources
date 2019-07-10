Any real-world Java class must be packaged. Packaging is a two-fold process:
first, you must add the package statement to your class declarations
second, you must place your .java and .class files in a folder structure that
corresponds to the dotted package name you've chosen.

Packaging Java code is most easily done by enforcing a project structure on
your design. This will make keeping your source files and your compiled class
files separate easy and will allow you to use boilerplate behaviors to compile
and to run your code.

In this repository you will find scripts for creating a standard Java project
with src and bin directories and a pre-made folder structure for your package.
Given a project 'foo', run proj.bat on Windows or proj.sh on a Mac to create
the following folders:

foo -> src -> edu -> acc -> java1 -> foo
foo -> bin

This structure defines the package edu.acc.java1.foo, which must be declared
at the top of all the .java source files you write in the foo/src/edu/acc/java1
folder.

The Windows batch script will move into foo\src as your working directory. On a
Mac, you must next change into the foo/src directory manually with:

cd foo/src

From the src directory, compile your code sending the output (.class files) to
the bin directory. This will re-create the package folder structure on the bin
side as well. Convenient!

javac -d ../bin edu/acc/java1/foo/*.java

Next, on both platforms you will change directories up and over to bin for testing:

cd ../bin

From the bi directory, run your main class with:

java edu.acc.java1.foo.Main

Using this design, the project name becomes part of the package name automatically
and the only thing that changes in your javac and java commands are the project
portion of the package name and the name you chose for your main class.

The javac command does not care about the direction of the directory separating
slashes on either platform - convenient again!

On a Mac, you must make the proj.sh file executable by running the following command
in the terminal from the same directory that contains your script. I like to keep
mine on the desktop.

chmod 755 proj.sh

