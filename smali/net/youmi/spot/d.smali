.class Lnet/youmi/android/spot/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/d;->a:Lnet/youmi/android/spot/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/d;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->h(Lnet/youmi/android/spot/a;)Z

    return-void
.end method
