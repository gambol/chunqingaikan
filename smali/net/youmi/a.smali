.class Lnet/youmi/android/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/AdBrowser;


# direct methods
.method constructor <init>(Lnet/youmi/android/AdBrowser;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a;->a:Lnet/youmi/android/AdBrowser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a;->a:Lnet/youmi/android/AdBrowser;

    invoke-virtual {v0}, Lnet/youmi/android/AdBrowser;->finish()V

    return-void
.end method
