.class Lnet/youmi/android/a/a/i/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/i/a/d;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/i/a/d;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/i/a/d;->a(Lnet/youmi/android/a/a/i/a/d;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/a/i/a/d;->a(Lnet/youmi/android/a/a/i/a/d;J)J

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    invoke-static {v2}, Lnet/youmi/android/a/a/i/a/d;->a(Lnet/youmi/android/a/a/i/a/d;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v2, v0, v2

    if-ltz v2, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/16 v2, 0x63

    const/high16 v3, 0x42c80000    # 100.0f

    iget-object v4, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    invoke-static {v4}, Lnet/youmi/android/a/a/i/a/d;->b(Lnet/youmi/android/a/a/i/a/d;)Landroid/view/animation/DecelerateInterpolator;

    move-result-object v4

    long-to-float v0, v0

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    invoke-virtual {v4, v0}, Landroid/view/animation/DecelerateInterpolator;->getInterpolation(F)F

    move-result v0

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    iget-object v1, v1, Lnet/youmi/android/a/a/i/a/d;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-static {v1}, Lnet/youmi/android/a/a/i/a/b;->a(Lnet/youmi/android/a/a/i/a/b;)Lnet/youmi/android/a/a/i/a/k;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/e;->a:Lnet/youmi/android/a/a/i/a/d;

    iget-object v1, v1, Lnet/youmi/android/a/a/i/a/d;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-static {v1}, Lnet/youmi/android/a/a/i/a/b;->a(Lnet/youmi/android/a/a/i/a/b;)Lnet/youmi/android/a/a/i/a/k;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->x()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "%"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/i/a/k;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
