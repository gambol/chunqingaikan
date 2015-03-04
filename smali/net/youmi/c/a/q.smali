.class Lnet/youmi/android/c/a/q;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/c/a/p;


# direct methods
.method constructor <init>(Lnet/youmi/android/c/a/p;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/c/a/q;->a:Lnet/youmi/android/c/a/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/c/a/q;->a:Lnet/youmi/android/c/a/p;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/p;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/c/a/q;->a:Lnet/youmi/android/c/a/p;

    invoke-static {v1}, Lnet/youmi/android/c/a/p;->a(Lnet/youmi/android/c/a/p;)Landroid/view/ViewTreeObserver$OnPreDrawListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v0, p0, Lnet/youmi/android/c/a/q;->a:Lnet/youmi/android/c/a/p;

    iget-object v1, p0, Lnet/youmi/android/c/a/q;->a:Lnet/youmi/android/c/a/p;

    invoke-static {v1}, Lnet/youmi/android/c/a/p;->b(Lnet/youmi/android/c/a/p;)F

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/c/a/p;->setYFraction(F)V

    const/4 v0, 0x1

    return v0
.end method
