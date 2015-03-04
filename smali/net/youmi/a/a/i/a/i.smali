.class public Lnet/youmi/android/a/a/i/a/i;
.super Lnet/youmi/android/a/a/j/b/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/youmi/android/a/a/i/a/i;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/e/a/a/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/e/a/a/a;)V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 v1, 0x1

    aput-object p3, v0, v1

    const/4 v1, 0x2

    aput-object p4, v0, v1

    invoke-direct {p0, p1, v0}, Lnet/youmi/android/a/a/j/b/f;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected varargs a(Landroid/content/Context;[Ljava/lang/Object;)Lnet/youmi/android/a/a/i/a/g;
    .locals 7

    const/4 v2, 0x0

    array-length v6, p2

    const/4 v0, 0x0

    move v5, v0

    move-object v4, v2

    move-object v0, v2

    :goto_0
    if-ge v5, v6, :cond_0

    aget-object v1, p2, v5

    instance-of v3, v1, Lnet/youmi/android/a/a/i/a/a/c;

    if-eqz v3, :cond_3

    move-object v0, v1

    check-cast v0, Lnet/youmi/android/a/a/i/a/a/c;

    move-object v3, v0

    :goto_1
    instance-of v0, v1, Lnet/youmi/android/a/a/e/a/a/b;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Lnet/youmi/android/a/a/e/a/a/b;

    :goto_2
    instance-of v4, v1, Lnet/youmi/android/a/a/e/a/a/a;

    if-eqz v4, :cond_1

    check-cast v1, Lnet/youmi/android/a/a/e/a/a/a;

    :goto_3
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move-object v4, v0

    move-object v2, v1

    move-object v0, v3

    goto :goto_0

    :cond_0
    new-instance v1, Lnet/youmi/android/a/a/i/a/g;

    invoke-direct {v1, p1, v0, v4, v2}, Lnet/youmi/android/a/a/i/a/g;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/a/c;Lnet/youmi/android/a/a/e/a/a/b;Lnet/youmi/android/a/a/e/a/a/a;)V

    return-object v1

    :cond_1
    move-object v1, v2

    goto :goto_3

    :cond_2
    move-object v0, v4

    goto :goto_2

    :cond_3
    move-object v3, v0

    goto :goto_1
.end method

.method protected a()Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/i;->a:Landroid/view/View;

    check-cast v0, Lnet/youmi/android/a/a/i/a/g;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/i/a/g;->getScrollY()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected synthetic b(Landroid/content/Context;[Ljava/lang/Object;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lnet/youmi/android/a/a/i/a/i;->a(Landroid/content/Context;[Ljava/lang/Object;)Lnet/youmi/android/a/a/i/a/g;

    move-result-object v0

    return-object v0
.end method
