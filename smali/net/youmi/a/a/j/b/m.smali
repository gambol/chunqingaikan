.class final Lnet/youmi/android/a/a/j/b/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/b/f;

.field private final b:Landroid/view/animation/Interpolator;

.field private final c:I

.field private d:I

.field private final e:I

.field private final f:I

.field private final g:J

.field private h:Z

.field private i:J


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/a/j/b/f;IIJ)V
    .locals 2

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lnet/youmi/android/a/a/j/b/m;->d:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/m;->h:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lnet/youmi/android/a/a/j/b/m;->i:J

    iput p2, p0, Lnet/youmi/android/a/a/j/b/m;->c:I

    iput p3, p0, Lnet/youmi/android/a/a/j/b/m;->e:I

    iput-wide p4, p0, Lnet/youmi/android/a/a/j/b/m;->g:J

    iget v0, p0, Lnet/youmi/android/a/a/j/b/m;->c:I

    iget v1, p0, Lnet/youmi/android/a/a/j/b/m;->e:I

    sub-int/2addr v0, v1

    iput v0, p0, Lnet/youmi/android/a/a/j/b/m;->f:I

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->b:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/a/j/b/m;->h:Z

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/j/b/f;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 10

    const-wide/16 v8, 0x3e8

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    iget-wide v0, p0, Lnet/youmi/android/a/a/j/b/m;->g:J

    cmp-long v0, v0, v6

    if-gtz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    iget v1, p0, Lnet/youmi/android/a/a/j/b/m;->e:I

    invoke-virtual {v0, v4, v1}, Lnet/youmi/android/a/a/j/b/f;->scrollTo(II)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/j/b/f;->a(Lnet/youmi/android/a/a/j/b/f;Z)Z

    iget-wide v0, p0, Lnet/youmi/android/a/a/j/b/m;->i:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/a/a/j/b/m;->i:J

    :goto_1
    iget-boolean v0, p0, Lnet/youmi/android/a/a/j/b/m;->h:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lnet/youmi/android/a/a/j/b/m;->e:I

    iget v1, p0, Lnet/youmi/android/a/a/j/b/m;->d:I

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    const-wide/16 v2, 0x8

    invoke-virtual {v0, p0, v2, v3}, Lnet/youmi/android/a/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/j/b/m;->i:J

    sub-long/2addr v0, v2

    mul-long/2addr v0, v8

    iget-wide v2, p0, Lnet/youmi/android/a/a/j/b/m;->g:J

    div-long/2addr v0, v2

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget v2, p0, Lnet/youmi/android/a/a/j/b/m;->f:I

    int-to-float v2, v2

    iget-object v3, p0, Lnet/youmi/android/a/a/j/b/m;->b:Landroid/view/animation/Interpolator;

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-interface {v3, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lnet/youmi/android/a/a/j/b/m;->c:I

    sub-int v0, v1, v0

    iput v0, p0, Lnet/youmi/android/a/a/j/b/m;->d:I

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    iget v1, p0, Lnet/youmi/android/a/a/j/b/m;->d:I

    invoke-virtual {v0, v4, v1}, Lnet/youmi/android/a/a/j/b/f;->scrollTo(II)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/m;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/j/b/f;->a(Lnet/youmi/android/a/a/j/b/f;Z)Z

    goto :goto_0
.end method
