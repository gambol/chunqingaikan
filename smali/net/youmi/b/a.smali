.class public Lnet/youmi/android/b/a;
.super Lnet/youmi/android/b/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Lnet/youmi/android/b/a;
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/b/a;->a:Ljava/util/HashMap;

    const-string v1, "val"

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lnet/youmi/android/b/a;
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/b/a;->a:Ljava/util/HashMap;

    const-string v1, "ac"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method a(Lnet/youmi/android/b/k;)Lnet/youmi/android/b/e;
    .locals 2

    invoke-super {p0, p1}, Lnet/youmi/android/b/b;->a(Lnet/youmi/android/b/k;)Lnet/youmi/android/b/e;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lnet/youmi/android/b/e;->b(I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lnet/youmi/android/b/a;
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/b/a;->a:Ljava/util/HashMap;

    const-string v1, "lb"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
