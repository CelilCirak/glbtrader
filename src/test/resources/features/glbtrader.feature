@glbtrader
  Feature: Glbtrader.com Web Page Automation Test
    Background: TC01 GlbTrader
      Given user is go glbtrader page
      And user verifies "Seller Sign in" is present
      And user verifies join "Seller Join Now" is present
      And user verifies about us "About Us" is present
      And user verifies that "Return Policy" is present
      And user verifies contact us "Contact Us" is present
      When uuser verifies package "Package" is present
      Then user is select "Furniture" in dropbox

    @glbtradercategories
    Scenario: TC02 user is go glbtrader page
      Given user verifies "Men Clothing & Accessories" under the categories
      And user verifies women "Women Clothing & Accessories" under the categories
      And user verifies jewelry "Jewelry & Accessories" under the categories
      And user verifies cellphone "Cellphones & Telecommunications" under the categories
      And user verifies computer "Computer & Office" under the categories
      And user verfies consumer "Consumer Electronics" under the categories
      And user verifies tops "Tops & Tees" under the men clothing
      And user verifies hoodies "Hoodies & Sweatshirts" under the men clothing
      And user verifies jacket "Jackets & Coats" under the men clothing
      And user verifies pants "Pants" under the men clothing
      And user verifies shirts "Shirts" under the men clothing
      And user verifies jeans "Jeans" under the men clothing
      And user verifies accessories "Accessories" under the men clothing
      And user verifies dresses "Dresses" under the women clothing
      And user verifies shirts "Blouses & Shirts" under the women clothing
      And user verifies hoodies "Hoodies & Sweatshirts" under the women clothing
      And user verifies jumpsuits "Jumpsuits" under the women clothing
      And user verifies accessories "Accessories" under the women clothing
      And user verifies intimates "Intimates" under the women clothing
      And user verifies earrings "Earrings" under the jewelry
      And user verifies wedding "Wedding & Engagement Jewelry" under the jewelry
      And user verifies fine "Fine Jewelry" under the jewelry
      And user verifies beads "Beads & Jewelry Making" under the jewelry
      And user verifies necklaces "Necklaces & Pendants" under the jewelry
      And user verifies rings "Rings" under the jewelry
      And user verifies bracelets "Bracelets & Bangles" under the jewelry
      And user verifies "Mobile Phones" under the cellphones
      And user verifies bags "Phone Bags & Cases" under the cellphones
      And user verifies mobile "Mobile Phone Accessories" under the cellphones
      And user verifies parts "Mobile Phone Parts" under the cellphones
      And user verifies power "Power Bank" under the cellphones
      And user verifies "Tablets" under the computer
      And user verifies office "Office Electronics" under the computer
      And user verifies tablet "Tablet Accessories" under the computer
      And user verifes storage "External Storage" under the computer
      And user verifies networking "Networking" under the computer
      And user verifies component "Computer Components" under the computer
      When user verifies computer "Computer Peripherals" under the computer
      Then user assert the "Hot Products" test










