# Spring_REST_API-user-backend
SpringBoot login system implementation. :tm: <br>
[AWS Deploy](http://jx11-env.eba-6nnp8tbt.eu-west-1.elasticbeanstalk.com/api/test/all)

URL

http://jx11-env.eba-6nnp8tbt.eu-west-1.elasticbeanstalk.com

ENDPOINTS

GET <br>
/api/test/all <br>
/api/test/user <br>
/api/test/mod <br>
/api/test/admin <br>
POST <br>
/api/auth/signup <br>
/api/auth/signin 

example body signup with postman

    {
        "username": "jetro",
        "email": "jetro@gmail.com",
        "password": "retrojet774",
        "role": ["admin"]
    }

example body signin with postman

    {
        "username": "jetro",
        "password": "retrojet774"
    }
