# customer-app

To find tomcat and other dependencies version use this maven command:-
_mvn dependency:tree_

Use following maven commands to run application from command line:
1)mvn install
2)mvn spring-boot:run
and also we can run our deployable jarfile as a stand-alone application using:-
_java -jar mobile-app-ws-0.0.1-SNAPSHOT.jar_

# Execute Sonar Qube:
1) Run Sonar Qube by running StartSonar.bat file present in SonarQube bin directory
2) place a sonar-project file in root directory of springboot project
3) Run sonar-scanner command in project directory to scan the project
4) check the project in localhost:9000 url

## Note
i) Disable "Force User Authentication" option at administrator -> security in sonar qube webpage and save it.
ii) Before running sonar-scanner command on cmd, ass its path to Environment variable -> System variable -> path as 'C:\sonar-scanner\bin' and to Environment variable -> System variable -> New ->
variable : SONAR_RUNNER_HOME
value: 'C:\sonar-scanner'
