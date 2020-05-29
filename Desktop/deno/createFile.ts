const encoder = new TextEncoder()

const greetText = encoder.encode('hello world \n my name is brad');

await Deno.writeFile('greet.txt', greetText);

