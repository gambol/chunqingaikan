.class Lnet/youmi/android/a/a/j/i;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/d;

.field private b:I

.field private c:F

.field private d:F

.field private e:F

.field private f:F


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/a/j/d;I)V
    .locals 1

    const/4 v0, 0x0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->c:F

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->d:F

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->e:F

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->f:F

    iput p2, p0, Lnet/youmi/android/a/a/j/i;->b:I

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const/high16 v2, 0x41c80000    # 25.0f

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, Lnet/youmi/android/a/a/j/i;->c:F

    iget v1, p0, Lnet/youmi/android/a/a/j/i;->e:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Lnet/youmi/android/a/a/j/i;->d:F

    iget v1, p0, Lnet/youmi/android/a/a/j/i;->f:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget v0, p0, Lnet/youmi/android/a/a/j/i;->b:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    packed-switch v0, :pswitch_data_1

    :cond_0
    :goto_1
    const/4 v0, 0x0

    return v0

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->c:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->d:F

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->e:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/a/j/i;->f:F

    goto :goto_0

    :pswitch_2
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;

    move-result-object v0

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/j;->i()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :pswitch_3
    iget-object v0, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;

    move-result-object v0

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/j;->k()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    return v0
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onShowPress(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget v0, p0, Lnet/youmi/android/a/a/j/i;->b:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;

    move-result-object v0

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/j;->h()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lnet/youmi/android/a/a/j/i;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->d(Lnet/youmi/android/a/a/j/d;)Lnet/youmi/android/a/a/j/j;

    move-result-object v0

    invoke-interface {v0}, Lnet/youmi/android/a/a/j/j;->j()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
