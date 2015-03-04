.class public Lnet/youmi/android/a/b/l/d;
.super Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    :try_start_0
    invoke-static {p2}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/l/d;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/l/d;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, p3}, Lnet/youmi/android/a/b/l/d;->setImageResource(I)V

    goto :goto_0
.end method
