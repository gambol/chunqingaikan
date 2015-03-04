.class Lnet/youmi/android/spot/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/c;->a:Lnet/youmi/android/spot/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/spot/c;->a:Lnet/youmi/android/spot/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lnet/youmi/android/spot/a;->b(Lnet/youmi/android/spot/a;Z)Z

    iget-object v0, p0, Lnet/youmi/android/spot/c;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->d(Lnet/youmi/android/spot/a;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/spot/c;->a:Lnet/youmi/android/spot/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lnet/youmi/android/spot/a;->b(Lnet/youmi/android/spot/a;Z)Z

    iget-object v0, p0, Lnet/youmi/android/spot/c;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->d(Lnet/youmi/android/spot/a;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
