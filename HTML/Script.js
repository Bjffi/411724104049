console.log("Hello");
const first=1;
const second=2;
console.log(first);
console.log(second);
const name="Ramya"
console.log(name)
const fruits=["Apple","Banana","Grapes"]
console.log(fruits[0])
console.log(fruits[1])
console.log(fruits[2])
fruits[1]="Orange"
console.log(fruits[1])
const arr=[1,"priya",true,4.5]
console.log(arr)
for(let i=0;i<arr.length;i++){
    console.log(arr[i])
}
const fourth=document.getElementById("ptag")
fourth.innerHTML="This is my fourth class"

function main(){
    console.log("I am writing function in js")
}
const input=document.getElementById("eventlistener")
const output=document.getElementById("Ptag")
input.addEventListener("input", ()=>{
    output.textContent = input.value
})