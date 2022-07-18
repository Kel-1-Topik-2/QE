@DataDokter111
Feature: Data Dokter Admin

  @ViewDokterData
  Scenario Outline: As a admin i want to view data dokter
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button data dokter
    And View Dokter data
    Examples:
      |email   |password   |
      |admin      |admin123   |

  @DetailDokterData
  Scenario Outline: As a admin i want to detail data dokter
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click Detail dokter data
    And Valid data detail dokter
    Examples:
      |   email   |password   |
      |admin      |admin123   |

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
      |admin   |admin123| Dr HAKIM | 1234421 | Dokter GIGI | BagasKHoirul   |   BagasKHoirul |BagasKHoirul|

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
      |admin   |admin123| Anissabag  | 123411 | Dokter Kulit |  BagasAniGAS    |   12345411    | 12345411|

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
      |admin   |admin123|   21122   |  bagas | 00942534590 |   1234567      |   1234567     |  1234567 | nama dokter perlu dibutuhkan  |
      |admin   |admin123|   21122   | 123445 | Dokter Gigi |   BagasBedah   |   Bagas213    |  Bagas213| hanya mengandung huruf          |
      |admin   |admin123|  Bagas    |  bagas | Dokter Gigi |   BagasBedah   |   Bagas213    |  Bagas213| NPA IDI minimal 6 karakter      |
      |admin   |admin123|  Bagas    | 123445 | 00990112122 |  BagasBedah    |   Bagas213    |  Bagas213| tidak menggandung angka         |
      |admin   |admin123|  Bagas    | 123445 | Dokter Gigi |   1234567      |   Bagas213    |  Bagas213| username perlu 8 digit          |
      |admin   |admin123|  Bagas    | 123445 | Dokter Gigi |   BagasBedah   |   12345678    |  Bagas213| Konfirmasi password tidak sama  |
      |admin   |admin123|   21122   |  bagas | 00942534590 |   BagasBedah   |   Bagas213    | 11111112 | Konfirmasi password tidak sama  |

  @NoDeleteDokterData
  Scenario Outline: As a admin i want to delete data dokter - No
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click Delete dokter data
    And Click button hapus tidak
    And Valid data delete dokter
    Examples:
      |   email   |password   |
      |admin      |admin123   |

  @YesDeleteDokterData
  Scenario Outline: As a admin i want to delete data dokter - Yes
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click Delete dokter data
    And Click button hapus ya
    And Valid data delete dokter
    Examples:
      |   email   |password   |
      |admin      |admin123   |

  @SearchDokterData
  Scenario Outline: As a admin i want to delete data dokter
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click search all category dokter data
    And Click chose nama dokter
    And Input data "<namacategory>" category
    And Valid data category pasien
    Examples:
      |   email   |password   |namacategory|
      |admin      |admin123   |    Bagas   |
      |admin      |admin123   | &%^%^*)%   |

