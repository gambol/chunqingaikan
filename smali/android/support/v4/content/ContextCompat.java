package android.support.v4.content; class ContextCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/content/ContextCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ContextCompat.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/content/ContextCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static startActivities(Landroid/content/Context;[Landroid/content/Intent;)Z
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "intents"    # [Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "intents"    # [Landroid/content/Intent;
a=0;//     .param p2, "options"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(One);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v4/content/ContextCompatJellybean;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatHoneycomb;->startActivities(Landroid/content/Context;[Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
