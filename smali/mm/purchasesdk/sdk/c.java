package mm.purchasesdk.sdk; class c { void a() { int a;
a=0;// .class public Lmm/purchasesdk/sdk/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Ljava/util/List;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/sdk/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)Lmm/purchasesdk/sdk/b;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lmm/purchasesdk/sdk/b;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v4=(Uninit);v5=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/sdk/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/b;->a()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v4=(Integer);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v4, v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lmm/purchasesdk/sdk/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/f;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/sdk/b;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lmm/purchasesdk/sdk/b;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/sdk/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/sdk/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "WeakDatas [weakDatas="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/c;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", mark="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ", channel="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
