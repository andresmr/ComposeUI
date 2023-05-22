# ComposeUI
Compose Multiplatfform DHIS2 Mobile UI componetns library

## Run storybook native
After made changes in the source code, generate APK via Select Build -> Build APK(s) -> Build APK(s) or ./gradlew assembleDebug.
Upload the apk to appetize: https://appetize.io/upload
In the received email you will have the API key of the apk, paste it into the file generate.js
In the terminal run: node generate.js
In the terminal run:  yarn build-storybook
The a folder called storybook-static will be generated, inside launch index.html

Full documentation is here: https://github.com/storybookjs/native
