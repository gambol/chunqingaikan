package cn.dm.android; class DMOfferActivity$3 { void a() { int a;
a=0;// .class Lcn/dm/android/DMOfferActivity$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/dm/android/listener/c;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/ui/a;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/dm/android/ui/a;
a=0;// 
a=0;// .field final synthetic b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/ui/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iput-object p1, p0, Lcn/dm/android/DMOfferActivity$3;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/DMOfferActivity$3;->a:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/DMOfferActivity$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcn/dm/android/model/a;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Lcn/dm/android/model/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p1, Lcn/dm/android/model/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/dm/android/model/AOWObject;->parser_list(Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 240
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/dm/android/model/AOWObject;
a=0;// 
a=0;//     .line 241
a=0;//     iget-boolean v0, v0, Lcn/dm/android/model/AOWObject;->executable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$3;->a:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/ui/a;->a(I)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;//     .locals 3
a=0;//     .param p1, "errorInfo"    # Lcn/dm/android/model/ErrorInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$3;->b:Lcn/dm/android/DMOfferActivity;
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
a=0;//     const-string v2, "\u51fa\u73b0\u5f02\u5e38-> code:["
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/android/model/ErrorInfo;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "] text:["
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/dm/android/model/ErrorInfo;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "]"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
}}
