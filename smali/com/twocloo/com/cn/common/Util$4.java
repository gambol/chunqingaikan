package com.twocloo.com.cn.common; class Util$4 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/Util$4;
a=0;// .super Ljava/util/TimerTask;
a=0;// .source "Util.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/Util;->showSoftKeyBoard2(Landroid/app/Activity;Landroid/view/View;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$act:Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/Util$4;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 864
a=0;//     invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/Util$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 867
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/Util$4;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-string v2, "input_method"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 868
a=0;//     .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V
a=0;// 
a=0;//     .line 869
a=0;//     return-void
a=0;// .end method
}}
