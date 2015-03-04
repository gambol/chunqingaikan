.class Lnet/youmi/android/a/a/c/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/webkit/GeolocationPermissions$Callback;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lnet/youmi/android/a/a/c/c;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/c/c;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/c/d;->c:Lnet/youmi/android/a/a/c/c;

    iput-object p2, p0, Lnet/youmi/android/a/a/c/d;->a:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object p3, p0, Lnet/youmi/android/a/a/c/d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/c/d;->a:Landroid/webkit/GeolocationPermissions$Callback;

    iget-object v1, p0, Lnet/youmi/android/a/a/c/d;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
