.class Lnet/youmi/android/a/a/j/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/j/d;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/d;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/h;->a:Lnet/youmi/android/a/a/j/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/h;->a:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->c(Lnet/youmi/android/a/a/j/d;)Landroid/view/GestureDetector;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 v0, 0x1

    return v0
.end method
