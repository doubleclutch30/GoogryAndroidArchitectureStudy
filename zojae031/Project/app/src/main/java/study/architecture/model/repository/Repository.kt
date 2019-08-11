package study.architecture.model.repository

import io.reactivex.Single
import study.architecture.model.entity.Market
import study.architecture.model.entity.Ticker

interface Repository {
    fun getMarkets(): Single<List<Market>>
    fun getTickers(markets: String): Single<MutableList<Ticker>>
}