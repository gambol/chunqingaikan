package mm.purchasesdk.core.billing; class ProductInfo { void a() { int a;
a=0;// .class public Lmm/purchasesdk/core/billing/ProductInfo;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TYPE_FOREVER:I = 0x0
a=0;// 
a=0;// .field public static final TYPE_LEASE:I = 0x1
a=0;// 
a=0;// .field public static final TYPE_REITERATION:I = 0x2
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mInfo:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mInfoKey:Ljava/util/ArrayList;
a=0;// 
a=0;// .field private mMobilePhone:Ljava/lang/String;
a=0;// 
a=0;// .field private mOldInfo:Ljava/util/HashMap;
a=0;// 
a=0;// .field private mProductType:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addKey(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfoKey:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfoKey:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfoKey:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfo:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfo:Landroid/os/Bundle;
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfo:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mOldInfo:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mOldInfo:Ljava/util/HashMap;
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mOldInfo:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getInfo()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfo:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInfoKey()Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfoKey:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMobilePhone()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mMobilePhone:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getOldInfo()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mOldInfo:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getProductType()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mProductType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue(Ljava/lang/String;)Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfo:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setInfo(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfo:Landroid/os/Bundle;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMobilePhone(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mMobilePhone:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOldInfo(Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mOldInfo:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setProductType(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mProductType:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setmInfoKey(Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/core/billing/ProductInfo;->mInfoKey:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
