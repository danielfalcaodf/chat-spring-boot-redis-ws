FROM nginx:1.17.1-alpine

COPY . /usr/share/nginx/html
COPY ./nginx-custom.conf /etc/nginx/conf.d/default.conf
COPY ./cert/*.pem /etc/nginx/certs/
