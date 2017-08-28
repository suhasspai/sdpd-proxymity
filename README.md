# Proxymity
A basic application that uses proximity sensor. Created only for use in labs by students of Software Development for Portable Devices (CS F314) course in BITS Pilani K. K. Birla Goa Campus for Semester-I 2017-18.

## Installation
### Using Github client
In Git Bash:
```bash
git clone https://github.com/suhasspai/sdpd-proxymity
```
In Git GUI:
1. Click 'Clone Existing Repository'.
2. Enter 'Source Location' as https://github.com/suhasspai/sdpd-proxymity.
3. Choose a desired Target Directory.
4. Click 'Clone'.
### Without Git client
Click on `Clone or download` above, download the ZIP file and unzip it.

## Accessing the source code
1. Open [Android Studio](https://developer.android.com/studio/index.html).
2. File -> Open...
3. Navigate to the installation folder and click OK.

## Phone setup for debugging
(Ignore this step if ADB interface is already enabled on the phone.)
1. Open the default `Settings` app on your Android phone (running Android 4.4 or higher versions).
2. (Ignore this step if developer options are already unlocked on the phone.) Go to `About phone` and tap `Build number` seven (7) times to unlock developer options. Go back to the main screen of the `Settings` app.
3. Tap `Developer options` and switch it on. Under the `Debugging` sub-heading enable the `Android debugging` option to enable the ADB interface for debugging Android applications on your phone.

## Running the sample
1. Connect your Android phone to the system via a USB cable.
2. Click the green play button on top or press `Shift+F10`, in Android Studio to run the application.
3. From the list of devices that appear, select your phone. Please note that selecting an emulator here will run the application, but the sensor values can't be tested properly.
4. Ensure that the phone is unlocked, and then click OK. The app will run after a few seconds.