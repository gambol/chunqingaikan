.class Lnet/youmi/android/a/a/j/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lnet/youmi/android/a/a/j/d;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/d;I)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    iput p2, p0, Lnet/youmi/android/a/a/j/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance v0, Lnet/youmi/android/a/a/j/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/j/f;-><init>(Lnet/youmi/android/a/a/j/e;)V

    new-instance v1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/j/e;->b:Lnet/youmi/android/a/a/j/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/j/d;->a(Lnet/youmi/android/a/a/j/d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
