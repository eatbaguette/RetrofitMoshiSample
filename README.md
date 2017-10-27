# 概要
Retrofit と Moshi を使ったサンプル
pythonは同じAPIを叩くやつ
ログに出力する

# 詰まった点と解決策
## Expected BEGIN_ARRAY but was BEGIN_OBJECT
モデルクラスの話。
ネストした要素は

```

List<Child>

data class Child()

```
で作れる。
Arrayで入ってる場合は、Listが要らなくて、Childだけで十分

