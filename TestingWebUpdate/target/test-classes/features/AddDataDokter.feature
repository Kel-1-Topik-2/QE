@AddDokterData
Feature: Add Data Dokter - Admin

#Harus ganti data Nama,Idi, Username, Pass, Valid
  @AddDokterDataValid
  Scenario Outline: As a admin i want to add data dokter - Valid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    And Click button tambah data
    Then I input "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" "<validpass>" dokter
    And Click button simpan
    And Valid data dokter
    Examples:
      |  email |password|namalengkap|   idi  |spesialis    |    username    |       pass    |validpass|
      |admin   |admin123| Ta Hikam  | 846311 |Dokter Hewan |   BagasDisiniYa  |   BagasDisiniYa  |BagasDisiniYa|

  @AddDokterDataKosong
  Scenario Outline: As a admin i want to add data dokter - Kosong
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    And Click button tambah data
    Then I input "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" "<validpass>" dokter
    And Click button simpan
    And Validate add error messenger "<text>" dokter
    Examples:
      |  email |password|namalengkap|   idi  |spesialis    |    username    |       pass    |validpass|text|
      |admin   |admin123|           |        |             |                |               |          |              |
      |admin   |admin123|           | 123456 | Dokter Gigi |   BagasBedah   |   BagasBedah  |BagasBedah| nama dokter perlu dibutuhkan     |
      |admin   |admin123|  Bagas    |        | Dokter Gigi |   BagasBedah   |   BagasBedah  |BagasBedah| NPA IDI perlu dibutuhkan         |
      |admin   |admin123|  Bagas    | 123456 |             |  BagasBedah    |   BagasBedah  |BagasBedah| spesialis dokter perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 123456 | Dokter Gigi |                |   BagasBedah  |BagasBedah| username dokter perlu dibutuhkan |
      |admin   |admin123|  Bagas    | 123456 | Dokter Gigi |   BagasBedah   |               |BagasBedah| katasandi dokter perlu dibutuhkan|
      |admin   |admin123|  Bagas    | 123456 | Dokter Gigi |   BagasBedah   |   BagasBedah  |         | katasandi dokter perlu dibutuhkan |

  @AddDokterDataInvalid
  Scenario Outline: As a admin i want to add data dokter - Invalid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    And Click button tambah data
    Then I input "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" "<validpass>" dokter
    And Click button simpan
    And Validate add error messenger "<text>" dokter
    Examples:
      |  email |password|namalengkap|   idi  |spesialis    |    username    |       pass    |validpass|text|
      |admin   |admin123|  12331    | 123456 | Dokter Gigi |   BagasBedah   |   BagasBedah  |BagasBedah| hanya mengandung huruf |
      |admin   |admin123|  Bagas    | 12345  | Dokter Gigi |   BagasBedah   |   BagasBedah  |BagasBedah| NPA IDD minimal 6 karakter|
      |admin   |admin123|  Bagas    | 123456 | 1           |  BagasBedah    |   BagasBedah  |BagasBedah| hanya mengandung huruf |
      |admin   |admin123|  Bagas    | 123456 | Dokter Gigi |     1          |   BagasBedah  |BagasBedah| username perlu 8 digit     |
      |admin   |admin123|  Bagas    | 123456 | Dokter Gigi |   BagasBedah   |     1         |BagasBedah| katasandi perlu 8 digit    |
      |admin   |admin123|  Bagas    | 123456 | Dokter Gigi |   BagasBedah   |   BagasBedah  |  1       | konfirmasi password tidak sama|