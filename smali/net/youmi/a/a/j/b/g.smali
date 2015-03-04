.class Lnet/youmi/android/a/a/j/b/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/b/f;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/b/f;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b/g;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/g;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/b/f;->a(Lnet/youmi/android/a/a/j/b/f;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/g;->a:Lnet/youmi/android/a/a/j/b/f;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/j/b/f;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method
