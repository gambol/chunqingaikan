package android.support.v4.content; class Loader$ForceLoadContentObserver { void a() { int a;
a=0;// .class public final Landroid/support/v4/content/Loader$ForceLoadContentObserver;
a=0;// .super Landroid/database/ContentObserver;
a=0;// .source "Loader.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/content/Loader;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x11
a=0;//     name = "ForceLoadContentObserver"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/content/Loader;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/content/Loader;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader$ForceLoadContentObserver;, "Landroid/support/v4/content/Loader<TD;>.ForceLoadContentObserver;"
a=0;//     iput-object p1, p0, Landroid/support/v4/content/Loader$ForceLoadContentObserver;->this$0:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Landroid/support/v4/content/Loader$ForceLoadContentObserver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public deliverSelfNotifications()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader$ForceLoadContentObserver;, "Landroid/support/v4/content/Loader<TD;>.ForceLoadContentObserver;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onChange(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "selfChange"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader$ForceLoadContentObserver;, "Landroid/support/v4/content/Loader<TD;>.ForceLoadContentObserver;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader$ForceLoadContentObserver;->this$0:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/content/Loader;->onContentChanged()V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
}}
