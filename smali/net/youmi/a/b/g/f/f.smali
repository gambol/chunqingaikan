.class public Lnet/youmi/android/a/b/g/f/f;
.super Lnet/youmi/android/a/b/g/f/a;


# instance fields
.field d:J

.field private e:J

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/f/a;-><init>(I)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/youmi/android/a/b/g/f/f;->e:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/f/f;->f:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 10

    invoke-super {p0, p1, p2, p3, p4}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    :cond_0
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lnet/youmi/android/a/b/g/f/f;->f:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/a/d;->g()Lnet/youmi/android/a/b/g/a/c;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/f/f;->f:Z

    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->a()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    iput-boolean v1, p0, Lnet/youmi/android/a/b/g/f/f;->f:Z

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v0, 0x67

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->c()Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v0, 0x6b

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->d()Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v0, 0x68

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lnet/youmi/android/a/b/g/f/f;->d:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x5dc

    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->e()J

    move-result-wide v6

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->f()J

    move-result-wide v8

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/c;->g()I

    move-result v3

    iget-wide v0, p0, Lnet/youmi/android/a/b/g/f/f;->e:J

    sub-long v0, v8, v0

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    const-wide/16 v4, 0x5dc

    div-long v4, v0, v4

    move-object v1, p4

    move-object v2, p3

    invoke-interface/range {v1 .. v9}, Lnet/youmi/android/a/b/g/d/e;->a(Lnet/youmi/android/a/b/g/e/a;IJJJ)V

    iput-wide v8, p0, Lnet/youmi/android/a/b/g/f/f;->e:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/a/b/g/f/f;->d:J
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
