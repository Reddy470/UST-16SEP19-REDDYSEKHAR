const person ={
            name :'sundari',
            age : 100,
            color : 'white',
            address : {
                city : 'Bijapur',
                state : 'karnataka',
                pincode : 591115
            },
            hobbies : ['coding','Bird Watching','singing']
        }
        console.log('JavaScript person object',person)
        const jsonObject = JSON.stringify(person)
        console.log('JSON person object',jsonObject)
        const javaScriptpersonObject = JSON.parse(jsonObject)
        console.log('JavaScript person object after parse',javaScriptpersonObject)

        localStorage.setItem('email','billgate@gmail.com')
        const emailID = localStorage.getItem('email')
        console.log('Email ID',emailID)
        localStorage.clear();
        //let vlaue = localStorage.getItem('email')

