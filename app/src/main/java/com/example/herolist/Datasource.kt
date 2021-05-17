package com.example.herolist

class Datasource {

    fun loadData(): List<Hero>{
        return listOf(Hero("Spiderman", "Peter Parker", "Marvel Comics", "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2020/02/spider-man-1876543.jpg"),
            Hero("Wolverine", "Logan Howlett", "Marvel Comics", "https://upload.wikimedia.org/wikipedia/en/5/5d/Wolverine_%28James_%27Logan%27_Howlett%29.png" ),
            Hero("Iron Man", "Tony Stark", "Marvel Comics", "https://static.wikia.nocookie.net/disney/images/9/96/Iron-Man-AOU-Render.png/revision/latest?cb=20180410032118&path-prefix=es"),
            Hero("Batman", "Bruce Wayne", "DC Comics", "https://lh3.googleusercontent.com/proxy/ZZLZbcWElFsHo45sFHlKBQvROnSuALS1NIkHz-B3kN4zBbQDy4IShAC2ILsFS46VKbmWHZK2s_SMB1s1_UHbo44jr99SYkVb6hkCt527B1Xi-ENuOKgDyoIno6gQWDky8XSSrgCWRpTr6PachrJPCrpjSWrJTm2WfVbZbT-nYbSOkPwYvDkjhG30WdLc5FnVugx5w-JnkgwksEEnxHID5BLzqv-5rvuiNdDi"),
            Hero("Goku", " Son Goku", " Shonen Jump", "https://www.show.news/__export/1595109462886/sites/debate/img/2020/07/18/goku_x2x_crop1595109404079.jpg_423682103.jpg")
        )
    }
}