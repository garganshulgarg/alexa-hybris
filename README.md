# alexa-hybris
We are trying to integrate Amazon Alexa with SAP Hybris. Using SAP Hybris OCC Capabilities.

Welcome to the alexa-hybris wiki!

Following are the steps required to integrate Alexa with Hybris:

1) Clone the repository into local, for this eg. we will consider F:\dev

2) You will need an AWS account. Register by accessing the url https://eu-west-1.console.aws.amazon.com/
Follwing video illustrates the same also you will need to generate the AWSAccessKeyId and AWSSecretKey which we will need to configure into eclipse.
https://www.useloom.com/share/09c27aeb58194bfb9bc7aead126d1654

3) After successful checkout of the project next step is to setup project in Eclipse. Following Video illustrates regarding the setup. 
https://www.useloom.com/share/77afbc086d174ec0a972d44663a7a96f

4) Following step illustrates the configuration of AWSAccessKeyId and AWSSecretKey into the Eclipse. Enter the values and save.

https://www.useloom.com/share/45919d2b75564527b0c0c6cf94baf42d

5) Once Eclipse is setup, next step is to Create skill in Alexa. For this you need to signup at https://developer.amazon.com
Once you are logged in you may access the Alexa portal. Following Video Illustrates the same.

https://www.useloom.com/share/4de5b4736bac4b6ea1d76ca7f4038a31

6) Once Lambda function is deployed into S3, now its time to configure the end point url's of Lambda function and Alexa.
Follwing video illustrates the same.

https://www.useloom.com/share/c68388eb09794513bbe7a6289ba2bf4c

7) Congratulations on completing all the steps now its time for testing our Alexa skill which is integrated and getting response from Hybris.

https://www.useloom.com/share/da387303a5644d80b4a4ca1b26d133ea

# Important Links for Reference:
* https://docs.aws.amazon.com/toolkit-for-eclipse/v1/user-guide/welcome.html eclipse toolkit
