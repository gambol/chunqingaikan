package com.twocloo.base.util; class ViewUtils$2 { void a() { int a;
a=0;// .class Lcom/twocloo/base/util/ViewUtils$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
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
a=0;// .field private final synthetic val$duration:I
a=0;// 
a=0;// .field private final synthetic val$msg:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/util/ViewUtils$2;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/util/ViewUtils$2;->val$msg:Ljava/lang/String;
a=0;// 
a=0;//     iput p3, p0, Lcom/twocloo/base/util/ViewUtils$2;->val$duration:I
a=0;// 
a=0;//     .line 240
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/ViewUtils$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/twocloo/base/util/ViewUtils$2;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/util/ViewUtils$2;->val$msg:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/twocloo/base/util/ViewUtils$2;->val$duration:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// .end method
}}
