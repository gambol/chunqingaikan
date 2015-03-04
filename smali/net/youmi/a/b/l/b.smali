.class Lnet/youmi/android/a/b/l/b;
.super Landroid/graphics/drawable/StateListDrawable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/l/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/b/l/a;)V
    .locals 3

    iput-object p1, p0, Lnet/youmi/android/a/b/l/b;->a:Lnet/youmi/android/a/b/l/a;

    invoke-direct {p0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const-string v2, "#661E90FF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {}, Lnet/youmi/android/a/b/l/a;->d()[I

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Lnet/youmi/android/a/b/l/b;->addState([ILandroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lnet/youmi/android/a/b/l/a;->e()[I

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/l/b;->addState([ILandroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lnet/youmi/android/a/b/l/a;->f()[I

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/l/b;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-void
.end method
