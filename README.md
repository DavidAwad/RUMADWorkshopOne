# SimpleAndroid



## Installation
Make sure you have git installed. If you don't, here you go.
```
sudo apt-get install git
```
OR
```
brew install git
```

Use the Github desktop app to clone this repository or go to your command line, create an android folder on the Desktop, and we'll clone our example app.

```shell
mkdir android
git clone https://github.com/DavidAwad/SimpleAndroid
```

You now have all the source code you need! Just import the project into Android Studio.

## Red / Blue Text
So the point of this app is to do some Basic I/O in Android on the latest SDK.

We'll take some form input, render the input on the screen and change it's colors. The colors can be changed through two buttons on the screen, in addition we'll create a button that will jump to a completely separate activity.

## How it works

Most of the hierarchy of Android happens through activities. You can think of activities as a sort of "execution context" for an android application. More simply put, an activity is what screen of the application the user can currently see.

Since this is the case, each activity has some code that determines how the screen will appear and has code that handles what the app can do. Kind of like HTML and JavaScript. Where each html page has Javascript that is specified for it and there are links on each HTML page that define what other pages you can go to.

So for example let's look at the [MainActivity.java](https://github.com/DavidAwad/SimpleAndroid/blob/master/app/src/main/java/edu/rutgers/rumad/rumadworkshopone/completed/MainActivityCompleted.java). There is a [MainActivity.xml](https://github.com/DavidAwad/SimpleAndroid/blob/master/app/src/main/res/layout/activity_main.xml) file and a mainActivity.java file. The java determines our functionality and the xml determines the appearance between the two. The way that the java file interfaces with the resources and buttons in the screen layout is through the resource collection referred to as [R.java](http://www.yugandroid.in/android-tutorials/r-java-file.html).

You'll see that we create pointers through references to the unique ID's on every single resource, which are defined inside the XML. After that you can manipulate these pointers with event listeners and whatever other functions the android library provides.

Enjoy the Docs! --David Awad

## Potential Improvements

Adding some api calls or http [requests](http://stackoverflow.com/questions/3505930/make-an-http-request-with-android) and displaying the output.


## Possible Bugs

You may get an error talking about there being a required content.Context try looking at [this](http://stackoverflow.com/questions/18509324/the-type-android-content-context-cannot-be-resolved-it-is-indirectly-referenced)


You may get an error looking something like

```android
X:XX:XX PM IllegalStateException: Cannot locate factory for objects of type DefaultGradleConnector, as ConnectorServiceRegistry has been closed.: Cannot locate factory for objects of type DefaultGradleConnector, as ConnectorServiceRegistry has been closed.
```

If you get this error try re-starting android studio.

## Contributors

This code was thankfully written by [Shreyas Hirday](https://github.com/shreyashirday) with some edits by me. He's a developer with mySwapp LLC, feel free to connect with him.
