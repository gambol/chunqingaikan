package com.tencent.connect.dataprovider; class DataType$TextOnly { void a() { int a;
a=0;// .class public Lcom/tencent/connect/dataprovider/DataType$TextOnly;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/dataprovider/DataType;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "TextOnly"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Lcom/tencent/connect/dataprovider/DataType$TextOnly;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     new-instance v0, Lcom/tencent/connect/dataprovider/DataType$TextOnly$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/dataprovider/DataType$TextOnly$1;);
a=0;//     invoke-direct {v0}, Lcom/tencent/connect/dataprovider/DataType$TextOnly$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextOnly$1;);
a=0;//     sput-object v0, Lcom/tencent/connect/dataprovider/DataType$TextOnly;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 87
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextOnly;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextOnly;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Lcom/tencent/connect/dataprovider/DataType$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/dataprovider/DataType$TextOnly;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextOnly;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextOnly;);
a=0;//     iput-object p1, p0, Lcom/tencent/connect/dataprovider/DataType$TextOnly;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getText()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextOnly;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextOnly;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
}}
