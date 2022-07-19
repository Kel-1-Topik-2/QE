@EditDokterData
Feature: Edit Data Dokter - Admin

#Harus ganti data Nama,Idi, Username, Pass, Valid
  @EditDokterDataValid
  Scenario Outline: As a admin i want to edit data dokter - Valid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data dokter
    And Click Detail dokter data
    And Valid data detail dokter
    And Click button edit profil
    Then I input edit "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" "<validpass>" dokter
    And Click button simpan
    And Valid edit data
    Examples:
      |  email |password|namalengkap|   idi  |  spesialis  |    username    |     pass      |validpass|
      |admin   |admin123| AnissaAngara  | 623253 | Dokter Gigi |  AnissaKopi    |   AnissaKopi  | AnissaKopi|

  @EditDokterDataInvalid
  Scenario Outline: As a admin i want to edit data dokter - Invalid
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button data dokter
    And Click Detail dokter data
    And Valid data detail dokter
    And Click button edit profil
    Then I input edit "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" "<validpass>" dokter
    And Click button simpan
    And Validate add error messenger "<text>" dokter
    Examples:
      |  email |password|namalengkap|   idi  |  spesialis  |    username    |     pass      |validpass|text|
      |admin   |admin123|   Bagas   | 123445 | Dokter Gigi |   BagasBedah   |   Bagas213    | Bagas213 |   |
      |admin   |admin123|   21122   |  bagas | 00942534590 |   1234567      |   1234567     |  1234567 |   |
      |admin   |admin123|   21122   | 123445 | Dokter Gigi |   BagasBedah   |   Bagas213    |  Bagas213| hanya mengandung huruf          |
      |admin   |admin123|  Bagas    |  bagas | Dokter Gigi |   BagasBedah   |   Bagas213    |  Bagas213| NPA IDI minimal 6 karakter      |
      |admin   |admin123|  Bagas    | 123445 | 00990112122 |  BagasBedah    |   Bagas213    |  Bagas213| tidak menggandung angka         |
      |admin   |admin123|  Bagas    | 123445 | Dokter Gigi |   1234567      |   Bagas213    |  Bagas213| username perlu 8 digit          |
      |admin   |admin123|  Bagas    | 123445 | Dokter Gigi |   BagasBedah   |   12345678    |  Bagas213| Konfirmasi password tidak sama  |
      |admin   |admin123|   21122   |  bagas | 00942534590 |   BagasBedah   |   Bagas213    | 11111112 | Konfirmasi password tidak sama  |