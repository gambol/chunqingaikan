.class public abstract Lnet/youmi/android/a/a/e/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Lnet/youmi/android/a/a/e/a/b/h;

.field private b:Lnet/youmi/android/a/a/e/a/b/f;

.field private c:Lnet/youmi/android/a/a/e/a/a/b;

.field private d:Lnet/youmi/android/a/a/e/a/b/i;

.field private e:Lnet/youmi/android/a/a/e/a/a/a;


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/a;->a:Lnet/youmi/android/a/a/e/a/b/h;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/a/a;->b:Lnet/youmi/android/a/a/e/a/b/f;

    return-void
.end method

.method public constructor <init>(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Lnet/youmi/android/a/a/e/a/a/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/a;->a:Lnet/youmi/android/a/a/e/a/b/h;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/a/a;->b:Lnet/youmi/android/a/a/e/a/b/f;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/a/a;->c:Lnet/youmi/android/a/a/e/a/a/b;

    return-void
.end method


# virtual methods
.method public a(IILjava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v3, 0x0

    sparse-switch p1, :sswitch_data_0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/a;->c:Lnet/youmi/android/a/a/e/a/a/b;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/a;->c:Lnet/youmi/android/a/a/e/a/a/b;

    invoke-virtual {v1, p1}, Lnet/youmi/android/a/a/e/a/a/b;->a(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/a;->c:Lnet/youmi/android/a/a/e/a/a/b;

    invoke-virtual {v1, p1, p2}, Lnet/youmi/android/a/a/e/a/a/b;->a(II)Lnet/youmi/android/a/a/e/a/b/g;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_3

    :try_start_1
    instance-of v1, v2, Lnet/youmi/android/a/a/e/a/b/j;

    if-eqz v1, :cond_1

    move-object v0, v2

    check-cast v0, Lnet/youmi/android/a/a/e/a/b/j;

    move-object v1, v0

    iget-object v4, p0, Lnet/youmi/android/a/a/e/a/a;->d:Lnet/youmi/android/a/a/e/a/b/i;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lnet/youmi/android/a/a/e/a/a;->d:Lnet/youmi/android/a/a/e/a/b/i;

    invoke-virtual {v1, v4}, Lnet/youmi/android/a/a/e/a/b/j;->a(Lnet/youmi/android/a/a/e/a/b/i;)V

    :cond_0
    iget-object v4, p0, Lnet/youmi/android/a/a/e/a/a;->e:Lnet/youmi/android/a/a/e/a/a/a;

    if-eqz v4, :cond_1

    iget-object v4, p0, Lnet/youmi/android/a/a/e/a/a;->e:Lnet/youmi/android/a/a/e/a/a/a;

    invoke-virtual {v1, v4}, Lnet/youmi/android/a/a/e/a/b/j;->a(Lnet/youmi/android/a/a/e/a/a/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    :try_start_2
    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/a;->a:Lnet/youmi/android/a/a/e/a/b/h;

    iget-object v4, p0, Lnet/youmi/android/a/a/e/a/a;->b:Lnet/youmi/android/a/a/e/a/b/f;

    invoke-interface {v2, v1, v4, p3}, Lnet/youmi/android/a/a/e/a/b/g;->a(Lnet/youmi/android/a/a/e/a/b/h;Lnet/youmi/android/a/a/e/a/b/f;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    :goto_2
    if-nez v1, :cond_2

    const/4 v1, 0x3

    invoke-static {v1}, Lnet/youmi/android/a/a/e/a/b/j;->b(I)Ljava/lang/String;

    move-result-object v1

    :cond_2
    return-object v1

    :sswitch_0
    :try_start_3
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->a(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->b(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->c(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_3
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->d(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_4
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->e(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_5
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->f(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_6
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->g(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_7
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/e/a/a;->h(I)Lnet/youmi/android/a/a/e/a/b/g;

    move-result-object v2

    goto :goto_0

    :sswitch_8
    move-object v2, v3

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    invoke-static {v1}, Lnet/youmi/android/a/a/e/a/b/j;->b(I)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v1

    goto :goto_2

    :catch_0
    move-exception v1

    move-object v1, v3

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_1

    :cond_4
    move-object v2, v3

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0xa -> :sswitch_7
        0x64 -> :sswitch_8
    .end sparse-switch
.end method

.method abstract a(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method abstract b(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method abstract c(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method abstract d(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dd(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public de(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public di(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public dw(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method abstract e(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method public e(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method abstract f(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method abstract g(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method abstract h(I)Lnet/youmi/android/a/a/e/a/b/g;
.end method

.method public i(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setExtendJsObject(Lnet/youmi/android/a/a/e/a/a/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/a;->e:Lnet/youmi/android/a/a/e/a/a/a;

    return-void
.end method

.method public setYmWebBrowser(Lnet/youmi/android/a/a/e/a/b/i;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/a;->d:Lnet/youmi/android/a/a/e/a/b/i;

    return-void
.end method

.method public w(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
