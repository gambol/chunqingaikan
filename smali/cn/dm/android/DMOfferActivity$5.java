package cn.dm.android; class DMOfferActivity$5 { void a() { int a;
a=0;// .class Lcn/dm/android/DMOfferActivity$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/dm/android/f/j$a;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/DMOfferActivity;->b(Lcn/dm/android/model/b;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/dm/android/model/b;
a=0;// 
a=0;// .field final synthetic b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/model/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     iput-object p1, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/DMOfferActivity$5;->a:Lcn/dm/android/model/b;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/DMOfferActivity$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v0}, Lcn/dm/android/DMOfferActivity;->c(Lcn/dm/android/DMOfferActivity;)Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "downloadTemplet complete:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 323
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$5;->a:Lcn/dm/android/model/b;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/model/b;->a(Z)V
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v1}, Lcn/dm/android/DMOfferActivity;->b(Lcn/dm/android/DMOfferActivity;)Lcn/dm/android/ui/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/ui/a;)V
a=0;// 
a=0;//     .line 327
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/DMOfferActivity;->b(Lcn/dm/android/DMOfferActivity;)Lcn/dm/android/ui/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/android/ui/a;->d()V
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/DMOfferActivity;->d(Lcn/dm/android/DMOfferActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs a([Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$5;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v0}, Lcn/dm/android/DMOfferActivity;->d(Lcn/dm/android/DMOfferActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "    "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " %"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 318
a=0;//     return-void
a=0;// .end method
}}
