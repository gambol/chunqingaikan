package android.support.v4.app; class ActivityCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ActivityCompat;
a=0;// .super Landroid/support/v4/content/ContextCompat;
a=0;// .source "ActivityCompat.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Landroid/support/v4/content/ContextCompat;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActivityCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static invalidateOptionsMenu(Landroid/app/Activity;)Z
a=0;//     .locals 2
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 65
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
