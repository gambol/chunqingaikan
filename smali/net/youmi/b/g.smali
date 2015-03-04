.class public Lnet/youmi/android/b/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/b/k;

.field private b:Landroid/content/Context;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/b/k;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/b/g;->b:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/b/g;->a:Lnet/youmi/android/b/k;

    iput p3, p0, Lnet/youmi/android/b/g;->c:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    const-wide/16 v0, 0x0

    const/4 v4, 0x1

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/b/g;->b:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/b/h;->a(Landroid/content/Context;)Lnet/youmi/android/b/h;

    move-result-object v5

    const/4 v2, 0x3

    iget-object v3, p0, Lnet/youmi/android/b/g;->a:Lnet/youmi/android/b/k;

    invoke-virtual {v3}, Lnet/youmi/android/b/k;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Lnet/youmi/android/b/h;->a(ILjava/lang/String;)Lnet/youmi/android/b/i;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lnet/youmi/android/b/i;->c()J

    move-result-wide v8

    sub-long v10, v6, v8

    const-wide/16 v12, 0x7530

    cmp-long v3, v10, v12

    if-gez v3, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v3, p0, Lnet/youmi/android/b/g;->c:I

    if-ne v3, v4, :cond_2

    invoke-static {v6, v7, v8, v9}, Lnet/youmi/android/b/a/a;->a(JJ)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_2
    move-object v4, v2

    :goto_1
    const/4 v2, 0x1

    iget-object v3, p0, Lnet/youmi/android/b/g;->a:Lnet/youmi/android/b/k;

    invoke-virtual {v3}, Lnet/youmi/android/b/k;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Lnet/youmi/android/b/h;->a(ILjava/lang/String;)Lnet/youmi/android/b/i;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lnet/youmi/android/b/i;->c()J

    move-result-wide v2

    :goto_2
    const/4 v8, 0x2

    iget-object v9, p0, Lnet/youmi/android/b/g;->a:Lnet/youmi/android/b/k;

    invoke-virtual {v9}, Lnet/youmi/android/b/k;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v8, v9}, Lnet/youmi/android/b/h;->a(ILjava/lang/String;)Lnet/youmi/android/b/i;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lnet/youmi/android/b/i;->c()J

    move-result-wide v0

    :cond_3
    invoke-virtual {v4, v6, v7}, Lnet/youmi/android/b/i;->a(J)V

    invoke-virtual {v5, v4}, Lnet/youmi/android/b/h;->a(Lnet/youmi/android/b/i;)Z

    iget-object v4, p0, Lnet/youmi/android/b/g;->a:Lnet/youmi/android/b/k;

    invoke-static {}, Lnet/youmi/android/b/b;->a()Lnet/youmi/android/b/f;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Lnet/youmi/android/b/f;->a(J)Lnet/youmi/android/b/f;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lnet/youmi/android/b/f;->b(J)Lnet/youmi/android/b/f;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/b/f;->d()Lnet/youmi/android/b/f;

    move-result-object v0

    invoke-virtual {v4, v0}, Lnet/youmi/android/b/k;->a(Lnet/youmi/android/b/b;)Lnet/youmi/android/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/b/k;->b()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_4
    new-instance v2, Lnet/youmi/android/b/i;

    invoke-direct {v2}, Lnet/youmi/android/b/i;-><init>()V

    iget-object v3, p0, Lnet/youmi/android/b/g;->a:Lnet/youmi/android/b/k;

    invoke-virtual {v3}, Lnet/youmi/android/b/k;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnet/youmi/android/b/i;->a(Ljava/lang/String;)V

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lnet/youmi/android/b/i;->b(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v2

    goto :goto_1

    :cond_5
    move-wide v2, v0

    goto :goto_2
.end method
