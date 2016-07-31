To build a docker image

	docker build -t mizan/knotify .

To run image 
	docker run -p 4561:8080 mizan/knotify

the docker image will run in port 4561

See the app running:

	http://localhost:4561/health