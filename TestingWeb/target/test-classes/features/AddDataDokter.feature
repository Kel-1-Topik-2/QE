@AddDokterData
Feature: Add Data Dokter - Admin

  Scenario Outline: As a admin i want to add data dokter
    Given Open page data dokter
    When Click button tambah data
    Then I input "<namalengkap>" "<idi>" "<spesialis>" "<username>" "<pass>" dokter
    And Click button simpan
    And Valid data dokter
#    And Validate add error messenger "<text>" dokter
    Examples:
      |namalengkap|idi|spesialis|username|pass|text|
      |   Bagas   |  12344 | Dokter Gigi |   BagasBedah   |   Bagas12  | |
#      |           |        |             |                |            | |
#      |           |  12344 | Dokter Gigi |   BagasBedah   |   Bagas12  | |
#      |  Bagas    |        | Dokter Gigi |   BagasBedah   |   Bagas12  | |
#      |  Bagas    | 12344  |             |  BagasBedah    |   Bagas12  | |
#      |  Bagas    |  12344 | Dokter Gigi |                |   Bagas12  | |
#      |  Bagas    |  12344 | Dokter Gigi |   BagasBedah   |            | |
#      |   12345   |  12344 | Dokter Gigi |   BagasBedah   |   Bagas12  | |
#      |   Bagas   |  Bagas | Dokter Gigi |   BagasBedah   |   Bagas12  | |
#      |   Bagas   |  12344 | 11223344556 |   BagasBedah   |   Bagas12  | |

