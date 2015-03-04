.class Lnet/youmi/android/b/f;
.super Lnet/youmi/android/b/b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/b/b;-><init>()V

    invoke-virtual {p0}, Lnet/youmi/android/b/f;->c()Lnet/youmi/android/b/b;

    return-void
.end method


# virtual methods
.method a(Lnet/youmi/android/b/k;)Lnet/youmi/android/b/e;
    .locals 2

    invoke-super {p0, p1}, Lnet/youmi/android/b/b;->a(Lnet/youmi/android/b/k;)Lnet/youmi/android/b/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/b/e;->b(I)V

    return-object v0
.end method

.method public a(J)Lnet/youmi/android/b/f;
    .locals 5

    iget-object v0, p0, Lnet/youmi/android/b/f;->a:Ljava/util/HashMap;

    const-string v1, "ft"

    const-wide/16 v2, 0x3e8

    div-long v2, p1, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public b(J)Lnet/youmi/android/b/f;
    .locals 5

    iget-object v0, p0, Lnet/youmi/android/b/f;->a:Ljava/util/HashMap;

    const-string v1, "ts"

    const-wide/16 v2, 0x3e8

    div-long v2, p1, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public d()Lnet/youmi/android/b/f;
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/b/f;->a:Ljava/util/HashMap;

    const-string v1, "osv"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
