FROM ubuntu:18.04
COPY . .
RUN apt-get update
RUN apt-get install leiningen -y
CMD (cd trello-clone; lein run)
