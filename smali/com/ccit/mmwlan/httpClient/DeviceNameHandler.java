package com.ccit.mmwlan.httpClient; class DeviceNameHandler { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;
a=0;// .super Lorg/xml/sax/helpers/DefaultHandler;
a=0;// .source "DeviceNameHandler.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private deviceNameInfo:Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;// .field private deviceNameInfoList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/ccit/mmwlan/vo/DeviceName;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private isCurrent:Z
a=0;// 
a=0;// .field private sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field private strRet:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 11
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 15
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 16
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     .line 17
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->isCurrent:Z
a=0;// 
a=0;//     .line 11
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public characters([CII)V
a=0;//     .locals 2
a=0;//     .param p1, "ch"    # [C
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "length"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-boolean v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->isCurrent:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->characters([CII)V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endDocument()V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->endDocument()V
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "uri"    # Ljava/lang/String;
a=0;//     .param p2, "localName"    # Ljava/lang/String;
a=0;//     .param p3, "qName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v0, "response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     iput-boolean v2, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->isCurrent:Z
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfo:Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfo:Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/DeviceName;->setResult(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "errormsg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfo:Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/DeviceName;->setErrormsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "deviceName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfo:Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/DeviceName;->setDeviceName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDataListSet()Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/ccit/mmwlan/vo/DeviceName;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public startDocument()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->startDocument()V
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
a=0;//     .locals 1
a=0;//     .param p1, "uri"    # Ljava/lang/String;
a=0;//     .param p2, "localName"    # Ljava/lang/String;
a=0;//     .param p3, "qName"    # Ljava/lang/String;
a=0;//     .param p4, "attributes"    # Lorg/xml/sax/Attributes;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     const-string v0, "response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->isCurrent:Z
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/vo/DeviceName;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/DeviceNameHandler;->deviceNameInfo:Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lorg/xml/sax/helpers/DefaultHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
}}
