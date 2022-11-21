# JavaLibraryPOC
This is a java library to help with intergartion to cellulant payment gateway.
The library can work with marven and gradle.

## Adding the library to your marven project<br/>
open your pom file and add the following:

- in your dependencies add below
```sh
<dependencies>
  <dependency>
    <groupId>com.github.joshuakisee</groupId>
    <artifactId>JavaLibraryPOC</artifactId>
    <version>POC-LIB-V10</version>
  </dependency>
</dependencies>
```

- in your repositories add below
```sh
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

That is it!!! you can now consume any class in this library.

# _Classes available for consumption:
- QueryBill
- Post Payment

## _QueryBill
queryBill is used to fetch Bill Information, i.e. Due Date and amount for presentment to the customer before payment.

### How to call QueryBill
```sh
PaymentTingg paymentTingg = new PaymentTingg();
String url = "https://beep2.cellulant.africa:9001/paymentRouter/JSONV2/";
return paymentTingg.queryBill(
        "MW",
        "my_bucks",
        "Mybucks@2022",
        "2094",
        "1028389745",
        "GOTVMW",
        "265888875598",
        url
);
```








